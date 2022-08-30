public class Queue {
    
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue (int size){
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public void add(String value){
        if (isFull()){
            System.out.println("Maaf " + value + ", kamar sudah terisi");
        } else {
            queArray[++rear] = value;
            System.out.println(value + " masuk kamar");
            nItems++;
        }
    }
    
    public String remove(){
        String temp = queArray[front];
        queArray[front] = "kosong";
        front++;
        if (front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    
    public void display(){ 
        int temp = this.front;
        for (int i = 0; i < queArray.length; i++){
            System.out.print(queArray[front++] + ", ");
            if (front == maxSize){
                front = 0;
            }
        }
        System.out.println("\n");
        front = temp;
    }
    
    public String peekFront(){
        return queArray[front];
    }
    
    public boolean isEmpety(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
    
    public int size(){
        return nItems;
    }
}