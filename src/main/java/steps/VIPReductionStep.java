package steps;

import entity.PipelineInput;
import java.util.Random;

public class VIPReductionStep extends AbstractStep<PipelineInput, PipelineInput> {

  @Override
  public PipelineInput process(PipelineInput input) throws StepException {
    //计算月卡减免
    input.setFee(input.getFee() - new Random().nextLong(10));
    return input;
  }
}
