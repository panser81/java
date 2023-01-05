package com.gmail.panser81.lesson10;

import java.util.Arrays;
import java.util.List;

public class ReplaceExecuteServiceImpl implements ExecuteService {

    @Override
    public void execute() {
        List<String> list = Arrays.asList("test +", "new line +", " +45", "details + info", "+ is a correct value");

        list.forEach((s) -> System.out.println(s.replace("+", "+++")));
    }
}
