/*Write method to find the HCF(Highest Common Factor ) of two numbers a and b
1. 8,32 -> 8  ,
2. 12,4 -> 4  ,
     */
//---------------------------------------------------------------------
import java.util.*;
import java.io.*;


publlic class Solution
{
public int recursively_findHCF(int a, int b)
{
if(b==0)
return a;
else
return recursively_findHCF(b,a%b);
}

}
public static void main String args[]
{
//Create Object of the class and Call your method here
}
}
