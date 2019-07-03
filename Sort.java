class Sort{
	public static void main(String args[])
		{
    		int i,j;
		for(i=0;i<args.length;i++)
			System.out.println(args[i]);
		for(i=0;i<args.length;i++)
		{
		for(j=i+1;j<args.length;j++)
		{
		if((args[i].compareTo(args[j]))>0)
			{String a=args[i];
			args[i]=args[j];
			args[j]=a;
		}}
	}
    System.out.println("Sorted Array.......");
		for(i=0;i<args.length;i++)
			System.out.println(args[i]);
}
}