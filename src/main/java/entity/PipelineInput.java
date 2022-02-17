package entity;

public class PipelineInput {

  private Long fee;

  private ParkingRecord parkingRecord;

  private Car car;

  private User user;

  public Long getFee() {
    if (fee == null) {
      return 0L;
    }
    return fee;
  }

  public void setFee(Long fee) {
    this.fee = fee;
  }

  public ParkingRecord getParkingRecord() {
    return parkingRecord;
  }

  public void setParkingRecord(ParkingRecord parkingRecord) {
    this.parkingRecord = parkingRecord;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
