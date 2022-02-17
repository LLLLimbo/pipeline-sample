import entity.PipelineInput;
import steps.FreeVerificationStep;
import steps.TempParkingCalStep;
import steps.VIPReductionStep;

public class Sample {


  public static void main(String[] args) {
    Pipeline<PipelineInput, PipelineInput> pipeline = new Pipeline<>(new FreeVerificationStep())
        .pipe(new VIPReductionStep())
        .pipe(new TempParkingCalStep());
    PipelineInput output = pipeline.execute(new PipelineInput());
    System.out.println(output.getFee());
  }

}
