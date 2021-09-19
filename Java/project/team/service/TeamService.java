package project.team.service;

import project.team.domain.Architect;
import project.team.domain.Designer;
import project.team.domain.Employee;
import project.team.domain.Programmer;

/**
 * @Description 关于开发团队成员的管理：添加、删除等
 * @ClassName TeamService
 * @Author HaiYu
 * @Date 2021/9/18 21:51
 * @Version 1.0
 */
public class TeamService {

    private static int count = 1;// 给memberID赋值使用
    private final int MAX_MEMBER = 5;// 限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];// 保存开发团队成员
    private int total;// 来记录开发团队的实际人数


    public void addMember(Employee e) throws TeamException {
//      成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
//      该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
//      该员工已在本开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }

//      该员工已是某团队成员
//      该员正在休假，无法添加
        Programmer p = (Programmer) e;
        if ("BUSY".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该员工已是某团队成员");
        }
        else if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该员正在休假，无法添加");
        }

//      团队中至多只能有一名架构师
//      团队中至多只能有两名设计师
//      团队中至多只能有三名程序员

        // 获取团队team已有成员中架构师，设计师，程序员的人数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            }
            else if (team[i] instanceof Designer) {
                numOfDes++;
            }
            else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }
        else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }
        else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }


        // 将p(或e)添加到现有的team中
        team[total++] = p;
        // p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberID(count++);

    }



    /**
     * @Description 判断指定的员工是否已经存在于现有的开发团队中
     * @Return boolean
     * @Author HaiYu
     * @Date 2021/9/19 16:14
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            return team[i].getId() == e.getId();
        }
        return false;
    }



    public void removeMember(int memberID, double d) {

    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }
}
