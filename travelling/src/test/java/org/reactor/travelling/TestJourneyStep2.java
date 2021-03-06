package org.reactor.travelling;


import org.reactor.travelling.step.AbstractJourneyStep;
import org.reactor.travelling.step.AbstractJourneyStepDirection;

public class TestJourneyStep2 extends AbstractJourneyStep<StringBuffer> {

    private final JourneyJournal journal;

    public TestJourneyStep2(JourneyJournal journal) {
        this.journal = journal;
    }

    @Override
    public void doBeforeStep() {
        journal.logJournalEntry("Please enter second value");
    }

    @Override
    public AbstractJourneyStepDirection<StringBuffer> doStep(String stepInput, StringBuffer journeySubject) {
        journeySubject.append(" # " + stepInput);
        return forward();
    }
}
