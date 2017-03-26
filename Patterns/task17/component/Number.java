package component;

public class Number extends Component {
	 int value;
	 
	 public Number(int value){
	    this.value = value;
	 }
	 
	 public int calculate(){
	    return value;
	 }
}
