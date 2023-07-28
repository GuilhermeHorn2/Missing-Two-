package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class main_misc {
	
	
	public static final int MAX = 1_000_000;
	
	
	
	public static void main(String[] args) {
	
	
	List<Integer> a = new ArrayList<>(Arrays.asList(1,2,4,5,6,8));
	System.out.println(missing_two(a));
		
	List<Integer> b = new ArrayList<>(Arrays.asList(1,2,5,6));
	System.out.println(missing_two(b));
		
	}
	private static int missing_one(List<Integer> arr) {
		
		int curr = 1;
		for(int i = 0;i < arr.size();i++){
			
			if(arr.get(i) != curr){
				return curr;
			}
			curr++;
		}
		
		return -1;
	}
	
	private static List<Integer> missing_two(List<Integer> arr){
		
		int[] v = {-1,-1};
		int curr = 1;
		
		int idx = 0;
		for(int i = 0;i < arr.size();i++){
			
			int x = arr.get(i);
			
			if(x != curr){
				
				if(x - curr == 2){
					v[0] = curr;
					v[1] = curr+1;
					break;
				}
				else{
					v[idx] = curr;
					curr = x;
					idx++;
				}
				
			}
			curr++;
		}
		
		return new ArrayList<>(Arrays.asList(v[0],v[1]));
	}	
	
}
