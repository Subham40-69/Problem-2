class problem2
{
	static int minC(int arr[], int n, int v)
	{
	if (v == 0) return 0;
	int s = Integer.MAX_VALUE;
	for (int i=0; i<n; i++)
	{
		if (arr[i] <= v)
		{
			int sr = minC(arr, n, v-arr[i]);

			if (sr != Integer.MAX_VALUE && sr + 1 < s)
				s = sr + 1;
		}
	}
	return s;
	}
	public static void main(String args[])
	{
   Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int c = Integer.parseInt(sc.nextLine());
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(sc.nextLine());
    }
	System.out.println("Minimum coins required is "+ minCoins(arr, n, c) );
	}
}
