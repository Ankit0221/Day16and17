package Day16_17_problem;

import java.util.Arrays;

public class Day16_17_6_anagram {

			static boolean Anagram(char[] str1, char[] str2)
			{
				int n1 = str1.length;
				int n2 = str2.length;

				if (n1 != n2)
					return false;

				Arrays.sort(str1);
				Arrays.sort(str2);

				for (int i = 0; i < n1; i++)
					if (str1[i] != str2[i])
						return false;

				return true;
			}
			public static void main(String args[])
			{
				char str1[] = {'a','b','c','d'};
				char str2[] = { 'b', 'c', 'd','a' };
				if (Anagram(str1, str2))
					System.out.println("The two strings are" + " Anagram ");
				else
					System.out.println("The two strings are not"+ " Anagram");
			}
		

	}


