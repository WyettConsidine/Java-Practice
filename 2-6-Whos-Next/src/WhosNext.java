import java.util.Scanner;

public class WhosNext
{
    public static void main(String[] args)
    {
        String[] customers = {
                "5 20",
                "7 10",
                "10 40",
                "15 30",
                "20 10",
                "25 32",
                "35 50",
                "43 26"
        };

        LinkedListQueue q = new LinkedListQueue();
        //Place customer data in q

        for (String customerInformation : customers) {
            q.enqueue(customerInformation);
        }

        //Initialize some variables
        int totalWaitTime = 0;
        Scanner sc = new Scanner((String)q.peekFront());
        int firstCustArrivalTime = sc.nextInt();
        int nextAvailTimeA = firstCustArrivalTime;
        int nextAvailTimeB = firstCustArrivalTime;
        //dequeue each customer and calculate his wait-time.
        while(!q.isEmpty()) {
            //Get customer data
            String[] customerInfo = ((String)q.dequeue()).split(" ");
            int custArrivalTime = Integer.parseInt(customerInfo[0]);
            int custHelpTime = Integer.parseInt(customerInfo[1]);

            // Get time this customer's help begins (the time he is dequeued)
            int dequeueTime = custArrivalTime;
            if(nextAvailTimeA <= nextAvailTimeB) { //decide which rep to use
                //…calculate dequeueTime for this customer…
                if(custArrivalTime < nextAvailTimeA)
                    dequeueTime = nextAvailTimeA;
                //(Note: This is not necessarily nextAvailTimeA because the queue may be empty
                //and the next customer hasn’t arrived yet.)

                //…calculate nextAvailTimeA based on dequeueTime and custHelpTime…
                nextAvailTimeA = dequeueTime + custHelpTime;
            } else {
                //…calculate  dequeueTime for this customer…
                if(custArrivalTime < nextAvailTimeB)
                    dequeueTime = nextAvailTimeB;
                //(Note: This is not necessarily nextAvailTimeB because the queue may be empty
                //and the next customer hasn’t arrived yet.)

                //…calculate nextAvailTimeB based on dequeueTime and custHelpTime…
                nextAvailTimeB = dequeueTime + custHelpTime;
            }
            //calculate thisWaitTime based on dequeueTime and     custArrivalTime…
            int thisWaitTime = dequeueTime - custArrivalTime;
            totalWaitTime += thisWaitTime;
        }
        System.out.println(totalWaitTime);
    }
}
