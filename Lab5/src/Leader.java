public class Leader {
    public static void main(String[] args) {
        assert args.length == 2 : "Must pass 2 integer arguments";
        Queue<Integer> queue = new Queue<>();
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        for (int i = 1;  i < n+1; i++) queue.enqueue(i);
        while (queue.size() > 1){
            for (int i = 0; i < m-1; i++){
                queue.enqueue(queue.dequeue());
            }
            System.out.println(queue.dequeue());
        }
        System.out.println("Leader: "+queue.dequeue());
    }
}
