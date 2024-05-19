package javapreparation;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		
		//Post Incremental
		int i=10;
		int j=i++;
		System.out.println(i);
		System.out.println(j);
		
		int k=-99;
		int l=k++;
		System.out.println(k);
		System.out.println(l);
		
		//Pre incremental
		int m=11;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		
		int o=-100;
		int p=++o;
		System.out.println(o);
		System.out.println(p);
		
		//Post decremental
		int tt=78;
		int pp=tt--;
		System.out.println(tt);
		System.out.println(pp);
		
		int sat=-200;
		int neel=sat--;
		System.out.println(sat);
		System.out.println(neel);
		
		//Pre decremental
		int test=88;
		int test1=--test;
		System.out.println(test);
		System.out.println(test1);
		
		int x=-88;
		int y=--x;
		System.out.println(x);
		System.out.println(y);
		
		int s2=40;
		System.out.println(s2++);
		System.out.println(s2);
		
		int s3=20;
		System.out.println(++s3);
		System.out.println(s3);
		
		int s4=20;
		System.out.println(--s4);
		System.out.println(s4);
		
		int s5=20;
		System.out.println(s5--);
		System.out.println(s5);
		
		//Complex one
		int na=1;
		int testing=na++ + na++ + na++ + na++;
		System.out.println(testing);
		System.out.println(na);

	}

}
