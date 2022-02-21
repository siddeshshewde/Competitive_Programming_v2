import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;

public class Solution
{
    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public static void main(String args[]) throws Exception
    {
        new Solution().start();
    }

    public void start() throws Exception
    {
        try
        {
            br = new BufferedReader(new FileReader("input_data/d_difficult.in.txt"));
            out = new PrintWriter(new FileWriter("ingredients.out"));
            solve();
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }
    }

    public void solve() throws Exception
    {
        read();
        int clients = ni();
        Set<String> like_ingredients = new HashSet<String>();
        Set<String> dislike_ingredients = new HashSet<String>();

        for (int i = 1 ; i <= clients ; i++)
        {
            read();
            int m = ni();

            for (int j = 0 ; j < m ; j++)
            {
                like_ingredients.add(st.nextToken());
            }

            read();
            int n = ni();

            for (int j = 0 ; j < n ; j++)
            {
                dislike_ingredients.add(st.nextToken());
            }
        }

        for (String s : dislike_ingredients)
        {
            if (like_ingredients.contains(s))
            {
                like_ingredients.remove(s);
            }
        }

        out.print(like_ingredients.size());

        for (String s : like_ingredients)
        {
            out.print(" " + s);
        }
        out.close();
    }

    void read() throws Exception
    {
        st = new StringTokenizer(br.readLine());
    }

    int ni()
    {
        return Integer.parseInt(st.nextToken());
    }

    String ns() throws Exception
    {
        String s = br.readLine();
        return s.length() == 0 ? br.readLine() : s;
    }
}