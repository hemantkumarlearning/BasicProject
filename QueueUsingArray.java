public class QueueUsingArray {
    int front;
    int rear;
    int size;
    int array[];
    QueueUsingArray(int size){
        this.size=size;
        array=new int[size];
        front=-1;
        rear=-1;
    }
    void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        array[rear]=data;

    }
    int dequeue(){
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=array[front];
        front++;
        if(front>rear){
            front=rear=-1;
        }
        return data;

    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingArray queue=new QueueUsingArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        System.out.println(queue.dequeue());
    }

}
