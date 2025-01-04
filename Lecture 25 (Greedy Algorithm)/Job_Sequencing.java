import java.util.*;

public class Job_Sequencing {
    static class Job{
        int deadline;
        int profit;
        int Id;

        public Job(int d, int p, int i){
            deadline = d;
            profit = p;
            Id = i;
        }
    }
    public static void main(String[] args) {
        int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        // int[][] jobsInfo = {{4, 60}, {2, 20}, {1, 40}, {3, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], i));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);  // sort in descending

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.Id);
                time++;
            }
        }

        // print seq
        System.out.println("Max jobs = " + seq.size());
        for (Integer i : seq) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
