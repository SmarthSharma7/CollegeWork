
import java.util.Scanner;

class Process {

    int pid, arrivalTime, burstTime, waitingTime, completionTime, turnaroundTime;
    private static int counter = 1;

    Process(int arrivalTime, int burstTime) {
        pid = counter;
        counter++;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

}

public class OSScheduling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of processes : ");
        int n = sc.nextInt();
        Process[] processes = new Process[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter arrival time of process " + (i + 1) + " :");
            int arrivalTime = sc.nextInt();
            System.out.println("Enter burst time of process " + (i + 1) + " :");
            int burstTime = sc.nextInt();
            processes[i] = new Process(arrivalTime, burstTime);
        }
        sortProcesses(processes);
        int totalBurstTime = 0;
        for (Process p : processes) totalBurstTime += p.burstTime;
        System.out.println("Enter algorithm to schedule these processes : " +
                "\n1. First Come First Serve" +
                "\n2. Shortest Job First" +
                "\n3. Shortest Remaining Time First");
        int choice;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    fcfs(processes);
                    break;
                case 2:
                    sjf(processes);
                    break;
                case 3:
                    srtf(processes);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 1 && choice != 2 && choice != 3);

        displayResults(processes);

    }

    static void sortProcesses(Process[] processes) {
        for (int i = 0; i < processes.length - 1; i++) {
            for (int j = 0; j < processes.length - i - 1; j++) {
                if (processes[j + 1].arrivalTime < processes[j].arrivalTime) {
                    Process temp = processes[j];
                    processes[j] = processes[j + 1];
                    processes[j + 1] = temp;
                }
            }
        }
    }

    static void fcfs(Process[] processes) {
        int timeCollapsed = 0;
        for (Process p : processes) {
            timeCollapsed = Math.max(timeCollapsed, p.arrivalTime) + p.burstTime;
            p.completionTime = timeCollapsed;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;
        }
    }

    static void sjf(Process[] processes) {

    }

    static void srtf(Process[] processes) {

    }

    static void displayResults(Process[] processes) {
        System.out.println("PID   AT   BT   CT   TAT   WT");
        for (Process p : processes) {
            System.out.println(" " + p.pid + "    " + p.arrivalTime + "    " +
                    p.burstTime + "    " + p.completionTime + "    " +
                    p.turnaroundTime + "     " + p.waitingTime);
        }
    }

}
