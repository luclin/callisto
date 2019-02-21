package com.luc.callisto.dp.cor;

/**
 * @author : luc
 * @date : 2019-01-22 19:42
 * Description: chain of responsibility
 */
public abstract class ProcessingObject<T> {
    protected ProcessingObject<T> sucessor;

    public void setSucessor(ProcessingObject<T> sucessor) {
        this.sucessor = sucessor;
    }

    public T handle(T input) {
        T r = handleWork(input);
        if (null != sucessor) {
            return sucessor.handle(r);
        }
        return r;
    }

    abstract protected T handleWork(T input);
}
