public class QueueExample {
    public static void main(String[] args) {

    }
}
class QueueDataStructure{
    int capacity;
    int[] queue_arrr;
    int front;
    int rear;
    int currentSize = 0;
    QueueDataStructure(int capacity){
        this.capacity = capacity;
        front = 0;
        rear = -1;
        queue_arrr = new int[this.capacity];

    }
    boolean isFull(){
        if (this.currentSize == this.capacity){
            return true;
        }else{
            return false;
        }

    }
    boolean isEmpty(){
        if (currentSize == 0){
            return true;
        }
        return false;
    }
    int peek(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }else{
            return queue_arrr[front];
        }
    }
    void enqueue(int data){
        if (isFull()){
            System.out.println("Full");
        }else{
            rear++;
            if(rear == capacity -1){
                rear = 0;
            }
            queue_arrr[rear] = data;
            currentSize ++;
        }
    }
    int dequeue(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }else{
            front ++;
            currentSize -- ;
            if(front == capacity - 1){
                int ret = queue_arrr[front - 1];
                front = 0;
                return ret;
            }else{
                return queue_arrr[front --];
            }
        }
    }
}