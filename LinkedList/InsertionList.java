package LinkedList;

public class InsertionList {
     
    Node head;

    //Insertion 

    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;
    
    }

    // Display 

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.print("null");
    }


    // Index Insertion 
    
    void IndexInsert(int index , int data ){
           
        if(head==null){
            insert(data);
        }






    }










    public static void main(String[]args){
        InsertionList list =new InsertionList();
        list.insert(20);
        list.insert(40);

        list.display();

    }


}
