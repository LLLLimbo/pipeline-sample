package steps;

import entity.PipelineInput;
import java.util.Random;

public class TempParkingCalStep extends AbstractStep<PipelineInput, PipelineInput> {

  @Override
  public PipelineInput process(PipelineInput input) throws StepException {
    //计算临时停车费用
    input.setFee(input.getFee() + new Random().nextLong(50));
    return input;
  }
}
