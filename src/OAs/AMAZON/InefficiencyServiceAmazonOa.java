package OAs.AMAZON;

public class InefficiencyServiceAmazonOa {
//    AWS has n servers, each of them has either a fault tolerance or high reliability. A system works better if all the servers have the  same attributes. The inefficiency of a group of servers is defined as the number of adjacent paris of servers that have different attributes.
//    eg : 1001001 --> 0 means falult tolerance and 1 means high reliability --> inefficiency of this server is = 4, as 4 times the attribute is changing in this server
//    if there is a '?' character in string, it means it can be 1 or 0 as per your choice to keep minimum inefficiency
//    find minimum inefficiency in a server string
public static void main(String[] args) {
    String server = "1001001";
    System.out.println(findInEfficiency(server));
}
static int findInEfficiency (String s){
    StringBuilder server = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != '?') {
            server.append(s.charAt(i));
        }
    }
    int minEfficiency = 0;
    for (int i = 1; i < server.length(); i++) {
        if (server.charAt(i) != server.charAt(i-1)) minEfficiency++;
    }
    return minEfficiency;
}
}
