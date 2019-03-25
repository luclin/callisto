package com.luc.mudan.dp.facade;

/**
 * @author : luc
 * @date : 2019-03-25 11:48
 * Description:
 */
public class ComputerFacade {
    CPU cpu;
    Memory memory;
    Disk disk;
    Display display;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
        display = new Display();
    }

    public void start() {
        cpu.start();
        disk.start();
        memory.start();
        display.start();
    }

    public void shutdown() {
        display.shutdown();
        memory.shutdown();
        disk.shutdown();
        cpu.shutdown();
    }
}
