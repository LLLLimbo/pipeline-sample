package steps;

import entity.PipelineInput;
import java.util.Random;

public class FreeVerificationStep extends AbstractStep<PipelineInput, PipelineInput> {

  @Override
  public PipelineInput process(PipelineInput input) throws StepException {
    //判断是否免费
    Random random = new Random();
    boolean isFree = random.nextBoolean();

    if (isFree) {
      input.setFee(0L);
      //中断管道
      super.interrupt = true;
    }

    return input;
  }
}
