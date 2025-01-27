package ShallowAndDeepCopy;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String impData;
    private List<String> domains = new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    public String getIp() {
        return ip;
    }

    public String getImpData() {
        return impData;
    }

    @Override
    public String toString() {
        return ip + " : " + impData + " : " + this.domains;
    }

    public void loadVeryImpData() throws InterruptedException{
        this.impData = "This is very Imp Data";

        domains.add("www.lcwd.com");
        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.whatsapp.com");

        Thread.sleep(2000);
       
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
