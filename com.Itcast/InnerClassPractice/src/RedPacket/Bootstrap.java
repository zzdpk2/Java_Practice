package RedPacket;

/*
    场景说明：红包发出去后，所有人都拿到红包，抢完了之后，最后一个红包给群主自己

    红包分发策略：
        1、普通红包（平均）： totalMoney / totalCount，余数放在最后一个红包
        2、手气红包（策略）: 最少一分钱，最多不超过平均数的2倍。余额越发越少
*/
public class Bootstrap {

}

