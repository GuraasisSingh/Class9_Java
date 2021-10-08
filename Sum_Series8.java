class Sum_Series8
{
    static void main( int n)
    {   int x;
        float s=0, ts=0,m=1;
        for(x=1; x<=n; x++)
        {
            s=s+x;
            m=m*x;
            ts= ts+s/m;
        }
        System.out.println(ts);
    }
}