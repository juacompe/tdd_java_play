
import org.h2.command.ddl.DeallocateProcedure;
import play.jobs.Job;
import models.Deal;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/**
 *
 * @author juacompe
 */
@OnApplicationStart
public class BootStrap extends Job {
    public void doJob() {
        if(Deal.count() == 0) {
            Fixtures.loadModels("initial-data.yml");
        }
    }
}
