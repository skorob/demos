package lv.skorob.threads.completion;

import java.util.concurrent.CompletionService;

/**
 * Created by Oleg Skorobogatov on 27.06.2016.
 */
public class ReportRequest implements Runnable {
    private String name;

    private CompletionService<String> service;
    public ReportRequest(String name, CompletionService<String>
        service){
        this.name=name;
        this.service=service;
    }

    @Override
    public void run() {
        ReportGenerator reportGenerator=new ReportGenerator(name,
            "Report");
        service.submit(reportGenerator);
    }

}
