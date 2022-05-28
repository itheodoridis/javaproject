public abstract class Computer_Parts{
    private String Motherboards;
    private String MemoryRAM;
    private String CPUs;
    private String Hard_Discs;
    private String Graphics;
    //five-argument constructor
    public Computer_Parts(String motherboards , String memoryRAM, String cpus, String hard_discs,
     String graphics){
     Motherboards = motherboards;
     MemoryRAM = memoryRAM;
     CPUs = cpus;
     Hard_Discs = hard_discs;
     Graphics = graphics;
    }
    public void setMotherboards( String motherboards ) {
        Motherboards = motherboards;}
    public String getMotherboards() {
        return Motherboards; }
        
    public void setMemoryRAM( String memoryRAM ) {
        MemoryRAM = memoryRAM; }
    public String getMemoryRAM() {
        return MemoryRAM; }
    
    public void setCPUs( String cpus ) {
        CPUs = cpus; }
    public String getCPUs() {
        return  CPUs; }
    
    public void setHard_Discs( String hard_Discs ) {
        Hard_Discs = hard_Discs; }
    public String getHard_Discs() {
        return Hard_Discs; }

    public void setGraphics( String graphics ) {
        Graphics = graphics; }
    public String getGraphics() {
        return Graphics; }
    
    public String toString() {
        return String.format( "Computer Parts include the following products:\n%s\n%s\n%s\n%s\n%s",
        getMotherboards(), getMemoryRAM(), getCPUs(), getHard_Discs(), getGraphics() );
        } // end method toString
}