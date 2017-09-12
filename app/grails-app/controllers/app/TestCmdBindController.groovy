package app

import groovy.transform.ToString

class TestCmdBindController
{
    def index(MyCmd cmd)
    {
        log.debug "params: $params"
        log.debug "cmd: $cmd"
        bindData(cmd, params)
        log.debug "cmd after bindData: $cmd"
        render(view: 'index', model: [cmd: cmd])
    }
}

@ToString
class MyCmd
{
    @Delegate
    MyDelegate delegate = new MyDelegate()

    static constraints = {}
}

@ToString
class MyDelegate
{
    String bindMe
}
