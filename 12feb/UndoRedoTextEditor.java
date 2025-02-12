
class Node{
    String textState;
    Node prev, next;
    public Node(String testState){
        this.textState = testState;
        this.prev=null;
        this.next=null;
    }
}
class TextEditor{
        Node head,tail,current;
        int maxhistory=10;
        int count=0;
        
        public TextEditor(){
            this.head=null;
            this.tail=null;
            this.current=null;
        }
        public void addState(String input){
            Node newNode = new Node(input);
            if(head==null){
                head=newNode;
                tail=newNode;
                current=newNode;
                count++;
            }
            else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
                current=tail;
                count++;
                if(count>maxhistory){
                    head=head.next;
                    head.prev=null;
                    count--;
                }
            }

        }
        public void undo(){
            if(current!=null||current.prev!=null){
                current=current.prev;
                System.out.println("Current State: "+current.textState);
                }
                else{
                    System.out.println("No previous state");
                }
        }
        public void redo(){
            if(current!=null||current.next!=null){
                current=current.next;
                System.out.println("cuurent state "+current.textState);
        }
        else{
            System.out.println("No next state");
        }
        
    }

    }
    public class UndoRedoTextEditor {
    
        public static void main(String[] args) {
            TextEditor editor = new TextEditor();
            editor.addState("State 1");
            editor.addState("State 2");
            editor.addState("State 3");
            editor.undo();
            editor.redo();
            editor.undo();
            editor.redo();

        
            
        }
    }