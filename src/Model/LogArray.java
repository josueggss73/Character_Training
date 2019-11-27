package Model;

import Model.CharacterAffector.CharacterStrategies.ILog;

import java.util.ArrayList;

public class LogArray implements ILogListing {

    private ArrayList<ILog> logs;

    public LogArray() {
        logs = new ArrayList<>();
    }

    public LogArray(ArrayList<ILog> logs) {
        this.logs = logs;
    }

    @Override
    public ILog getLog(int index) {
        return logs.get(index);
    }

    @Override
    public void addLog(ILog log) {
        logs.add(log);
    }
}
