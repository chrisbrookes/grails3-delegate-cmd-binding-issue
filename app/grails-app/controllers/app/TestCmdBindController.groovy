package app

import groovy.transform.ToString

class TestCmdBindController
{
    def index(MyCmd cmd)
    {
        log.debug "params: $params"
        log.debug "cmd: $cmd"
        bindData(cmd, params)
        log.debug "cmd after bind: $cmd"

        if (!cmd.validate()) {
            log.error "${g.renderErrors(bean: cmd)}"
        }
        else log.debug "validated ok"
        render(view: 'index', model: [cmd: cmd])
    }
}

@ToString
class MyCmd
{
    @Delegate
    MyDelegate delegate = new MyDelegate()

    static constraints = {
        bindMe bindable: true
        //superField nullable: true // validates if uncommented
    }
}

@ToString
class MyDelegate extends DelegateSuper
{
    String bindMe
}

class DelegateSuper
{
    String superField
}