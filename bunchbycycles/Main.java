package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };
  
  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
    
  }

 public static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    int i;
    for(i=0;i<cycles.length;i++){
      if(cycles[i]<150){
        counts.lowCount++;
     }else if(cycles[i]>=150 && cycles[i]<=649){
        counts.mediumCount++;
     }else{
        counts.highCount++;
     }
    return counts;
  }

  public static testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 1);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 2);
    System.out.println("Done counting :\n");
  }

}
