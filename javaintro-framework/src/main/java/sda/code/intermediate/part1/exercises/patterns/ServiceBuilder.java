package sda.code.intermediate.part1.exercises.patterns;

import sda.code.intermediate.part1.exercises.data.Service;

/**
 * @see ProductBuilder
 */
public class ServiceBuilder extends ProductBuilder<ServiceBuilder, Service> {
    private Integer time;

    public ServiceBuilder withTime(Integer time) {
        this.time=time;
        return this;
    }

    @Override
    protected void validate() {
        super.validate();
        if(time==null || time<=0){
            throw new InvalidBuilderState("Time must be set and cannot be less than zero");
        }
    }

    @Override
    public Service build() {
        prepare();
        validate();
        return new Service(name,price,time);
    }

}
