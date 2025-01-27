package PrototypeDesignPattern;

public class NetworkConnection implements Cloneable {

        private String ip;
        private String impData;

        
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

        public void loadVeryImpData(){
            this.impData = "This is very Imp Data";
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return ip + " : " + impData;
        }
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

}
