import java.util.*;

class Solution {
    public int mostBooked(int n, int[][] meetings) {

        // Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // Min-heap of available room numbers
        PriorityQueue<Integer> availableRooms = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableRooms.offer(i);
        }

        // Min-heap of busy rooms: [endTime, roomNumber]
        PriorityQueue<long[]> busyRooms = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? Long.compare(a[1], b[1]) : Long.compare(a[0], b[0])
        );

        int[] meetingCount = new int[n];

        for (int[] meeting : meetings) {
            long start = meeting[0];
            long end = meeting[1];
            long duration = end - start;

            // Free rooms that have completed meetings
            while (!busyRooms.isEmpty() && busyRooms.peek()[0] <= start) {
                availableRooms.offer((int) busyRooms.poll()[1]);
            }

            if (!availableRooms.isEmpty()) {
                // Assign available room
                int room = availableRooms.poll();
                busyRooms.offer(new long[]{end, room});
                meetingCount[room]++;
            } else {
                // Delay meeting
                long[] earliest = busyRooms.poll();
                long newEnd = earliest[0] + duration;
                int room = (int) earliest[1];
                busyRooms.offer(new long[]{newEnd, room});
                meetingCount[room]++;
            }
        }

        // Find room with maximum meetings
        int maxRoom = 0;
        for (int i = 1; i < n; i++) {
            if (meetingCount[i] > meetingCount[maxRoom]) {
                maxRoom = i;
            }
        }

        return maxRoom;
    }
}
