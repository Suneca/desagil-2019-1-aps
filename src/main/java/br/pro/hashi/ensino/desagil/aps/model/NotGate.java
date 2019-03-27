package br.pro.hashi.ensino.desagil.aps.model;

public class NotGate extends Gate {
    private final NandGate nand;


    public NotGate() {
        super(1);

        nand = new NandGate();
    }


    @Override
    public boolean read() {
        return nand.read();
    }


    @Override
    public void connect(int inputPin, SignalEmitter emitter) {
        if (inputPin != 0) {
            throw new IndexOutOfBoundsException((new Integer(inputPin)).toString());
        }
        nand.connect(0, emitter);
        nand.connect(1, emitter);
    }
}
