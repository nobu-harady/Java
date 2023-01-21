/*
//3-5 
public class Main {
    public static void main(String[] args){
    	int i = 5;
    	int j = 10;
    	int k = 15;
    	if((i < j) || (k-- > j)) {
    		System.out.println("First if, value of k: " + k);
    	}
    	if((i < j) && (--k < j)) {
    		System.out.println("Second if, value of k: " + k);
    	}
    	System.out.println("Out of if, k: " + k);
    }
}
//3-6
public class Main {
	public static void main(String[] args) {
		int [] counts = {1, 2, 3, 4, 5};
		counts[1] = (counts[2] == 2) ? counts[3] : 99;
		System.out.println(counts[1]);
	}
}
//3-8
public class Main {
	public static void main(String[] args) {
		String str = "Orange";
		switch(str) {
		case "orange":
			System.out.println("Orange");
		case "apple":
			System.out.println("Apple");
			break;
		default:
			System.out.println("default");
		}
	}
}
//3-9
public class Main {
	public static void main(String[] args) {
		Integer num = 100;
		switch(num) {
		case "10":
			System.out.println("A ");
		case "100":
			System.out.println("B ");			
		default:
			System.out.println("C");
		}
	}
} 
//3-10
public class Main {
	public static void main(String[] args) {
		int val = 1;
		switch(val) {
		case 0:
			System.out.println("X ");
		case 1 | 2:
			System.out.println("Y ");
		case 10:
			System.out.println("Z ");
		}
	}
}
//3-11
public class Main {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = new String("Java");
		if(str1 == str2) System.out.println("==");
		if(str1.equals(str2)) System.out.println("equals");
	}
}
//3-12
public class Main {
	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = str1;
		if(str1 == str2) System.out.println("==");
		if(str1.equals(str2)) System.out.println("equals");
	}
}
//3-13	
public class Main {
	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = "Java";
		String str3 = str1.intern();
		System.out.println((str1 == str2) + " ");
		System.out.println((str1 == str3) + " ");
		System.out.println((str2 == str3));
	}
}
//3-14
public class Main {
	public static void main(String[] args) {
		String str = "existance";
		str.replace("e", "*");
		System.out.println(str);
	}
}
//3-16
public class Main {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("0123 456 ");
		if(str.length() == 9)
			str.insert(9, "abcde");
			str.delete(2, 5);
			System.out.println(str.indexOf("d"));
	}

}
//3-17
public class Main {
	public static void main(String[] args) {
		String str = "12345";
		str += 6789;
		str -= 6789;
		str += 0;
		System.out.println("str : " + str);
	}
}
//3-18
public class Main {
	public static void main(String[] args) {
		String str = new String("Hello");
		StringBuilder sb = new StringBuilder("Hello");
		str.concat(" dear");
		sb.append(" dear");
		System.out.println("str: " + str + ", sb: " + sb);
	}
}
//4-1
public class Main {
	public static void main(String[] args) {
		for(String s : args) {
			switch(s) {
			case "one" :
				break;
			case "two" :
				continue;
			}
			System.out.println(s + " ");
		}
	}
}
//4-2
public class Main {
	public static void main(String[] args) {
		String[] arrays = { "xxx", "yyy", "zzz" };
		for(int i = 0; i < arrays.length; i++)
			System.out.println(arrays[i]);
		for(String s : arrays)
			System.out.println(s);
	}
}
//4-3
public class Main {
	public static void main(String[] args) {
		OuterLoop: for(int i = 0; i < 2; i++) {
			for(int j = 1; j < 4; j++) {
				if(i == j) {
					continue OuterLoop;
				}
				System.out.println( " i = " + i + " j = " + j );
			}
		}
	}
}
//4-4
public class Main {
	public static void main(String[] args) {
		int i = 2;
		Outer:
			if(i < 5) {
				System.out.println("i: " + i);
				i++;
				continue Outer;
			}
	}
}
//4-5
public class Main {
	public static void main(String[] args) {
		int[][] ary = {{1, 2}, {3,4}};
		for(int x = 0; x < ary.length; x++) {
			for(int y = 0; y < ary[x].length; y++) {
			ary[x][y] = ary[x][y] * ary[x][y];
			System.out.println(ary[x][y] + " ");
			}
		}
	}
}
//4-6
public class Main {
	public static void main(String[] args) {
		String[] ary = {"x", "y", "z"};
		int i = 1;
		for(String str : ary) {
			System.out.print("[" + i + "]");
			i++;
			switch(str) {
			case "x":
		          System.out.print("x ");
	        case "y":
	          System.out.print("y ");
	          break;
	        case "a":
	          System.out.print("a ");
	      }
	    }
	  }
	}
//4-7
public class Main {
	public static void main(String[] args) {
		int j = 0;
		for(int i = 20; i > 15; i--) {
			j++;
			System.out.print(j + " ");
		}
	}
}
//4-8
public class Main {
	public static void main(String[] args) {
		String[] ary = {"a", "b", "c"};
		for(String s : ary) {
			int i = 0;
			while(i < ary.length) {
				i++;
				System.out.print(i + " ");
			}
		}
	}
}
//4-9
public class Main {
  public static void main(String[] args) {
	  int[] ary = {10, 20, 30, 40, 50};
	  int i = 5;
	  for(int a : ary) {
		  while(i < ary.length) {
			  i++;
			  System.out.print(i + " ");
		  }
	  }
  }
}
//4-10
public class Main {
  public static void main(String[] args) {
		String[] ary = {"Orange", "Apple", "Banana"};
		for(String str : ary) {
			switch(str) {
			case "Orange":
		          System.out.print("Orange ");
	        case "Apple":
	          System.out.print("Apple ");
	          break;
	        default:
	          System.out.print("other ");
			}
		}
  	}
}
//4-11		
public class Main {
  public static void main(String[] args) {
	  String[] ary = {"10", "20", "30", "40"};
	  for(String str : ary) {
		  if(str.equals("20")) {
			  continue;
		  }
		  System.out.print(str + " ");
		  if(str.equals("30")) {
			  break;
	      }
	    }
	  }
	}
//4-12
public class Main {
	public static void main(String[] args) {
		int[] ary = {1, 2, 3, 4, 5};
		int i = 1;
		while(i < ary.length) {
			i++;
			if(i == 2) {
				continue;
			}
			System.out.print(i + " ");
			if(i > 3) {
				break;
			}
		}
	}
}
//4-13
public class Main{
	public static void main(String[] args) {
		String[] ary = {"xx", "yy"};
		for(int i = 0; i < ary.length; i++) {
			int a = 0;
			if(a < 1) {
				while(a < ary.length) {
					System.out.print(ary[a] + " ");
					a++;
				}
			}
		}
	}
}
//4-14
public class Main {
  public static void main(String[] args) {
	  String[] ary1 = new String[2];
	  String[] ary2 = {new String("A"), "B"};
	  for(String s : ary1) { System.out.print(s + " "); }
	  for(String s : ary2) { System.out.print(s + " "); }
  }
}
//4-15
public class Main {
  public static void main(String[] args) {
	  String[][] ary = {{"a", "b"},
			  			{"c", "d", null, null, null}};
	  for(int x = 0; x < ary.length; x++ ) {
		  for(int y = 0; y < ary.length; y++ ) {
			  System.out.print(ary[x][y] + " ");
		  }
	  }
  }
 }
//5-2
public class Main {
	final int a;
	Main(int b) { a = b; }
	void method(int c) { a = c; }
	public static void main(String[] args) {
		Main oj = new Main(10);
		obj.method(20);
		System.out.println(obj.a);
	}
}
//5-3
public class Main {
	int x = 3;
	static int y = 2;
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		Main obj = new Main();
		obj.printIt();
		obj.printIt(y);
	}
	
	Main() { x = x+1; }
	static { y += y; }
	
	void printIt() {
		System.out.print(++x);
	}
	void printIt(int y) {
		System.out.print(" " + ++y);
	}
}
//5-4
public class Main {
	void x(int num) {
		num += 30;
	}
	public static void main(String[] args) {
		int num = 10;
		Main obj = new Main();
		obj.x(num);
		System.out.println(num);
	}
}
//5-5
public class Main {
	void x(int[] num) {
		num[0] += 30;
	}
	public static void main(String[] args) {
		int[] num = {10};
		Main obj = new Main();
		obj.x(num);
		System.out.println(num[0]);
	}
}
//5-6 B, D, E
public class Main {
	int num1 = 100;
	static String data2 = "hello";
	public static void main(String[] args) {
		System.out.println( new Main().data2 + " " + new Main().num1 );
		System.out.println( Main.data2 + " " +  new Main().num1 );
		System.out.println( data2 + " " + new Main().num1 );
	}
}
//5-8 A, B, 
public class Main {
	static void foo(String[] s) { System.out.println("hi");}
	//static void foo(String... s) { System.out.println("hi");
	public static void main(String[] args) {
		foo(args);
	}
}
//5-9
class Test {
  static void methodA() {
    methodB();
    Test.methodB();
    methodC();
    Test.methodD();
  }
  static void methodB() { }
  void methodC() {
    methodB();
    Test.methodB();
    methodD();
    Test.methodD();
  }
  void methodD() { }
}
*/
//5-10
class Boo {
  private String msg;
  public Boo(String m) { msg = m; }
  public void setMsg(String m) { msg = m; }
  public String getMsg() { return msg; }
  public Goo useGoo(Goo g) {
    setMsg(g.getMsg());
    return g;
  }
}

class Goo {
  private String msg;
  public Goo(String m) { msg = m; }
  public void setMsg(String m) { msg = m; }
  public String getMsg() { return msg; }
}

public class Main {
  public static void main(String[] args) {
    Boo b = new Boo("Boo");
    Goo g = new Goo("Goo");
    b.useGoo(g);
    System.out.println(b.getMsg() + " : " + g.getMsg());
  }
}













