package steps;

public abstract class AbstractStep<I, O> implements Step<I, O> {

  boolean interrupt = false;

}
