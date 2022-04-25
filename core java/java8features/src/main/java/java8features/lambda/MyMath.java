package java8features.lambda;

class MyMath {
	
	 public static boolean checker(PerformOperation p, int num) {
	  return p.check(num);
	 }
	 // Write your code here

	    public static PerformOperation isOdd(){
	        return a -> (a % 2 != 0)? true:false;
	    }
	    
	    public static PerformOperation isPrime(){
	           return a ->{ for (int i = 2; i * i <= a; i++) {
	                if (a % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	               };
	    }

	    public static PerformOperation isPalindrome() {
	        return a -> a == Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString()) ? true : false;
	    }
	}