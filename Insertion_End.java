public class Insertion_End {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    void insertEnd(int d)
    {
        
        Node fourth=new Node(d);
        if(head==null)
        {
            head=fourth;
            return;
        }
        fourth.next=null;
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;

        temp.next = fourth;
        return;
        
    }
    
    void print()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    
    public static void main(String[] args) {
        Insertion_End list=new Insertion_End();
        // list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        list.insertEnd(4);
        
        list.print();
        

    }
    
}
