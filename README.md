# JChat : Jingwen's Bungee Chat System(JBCS)
This project is now ABANDONED,will be no any updates.
弃坑了，不会有更新了
先提供 简体中文
## 原理 
通过第三方插件SpigotLib实现的一个跨服喊话功能。
后期将添加跨服私信等。

将会连接一个MySQL数据库。
当玩家执行/lb时，将连接数据库检查是否有足够的喇叭，如果没有将拒绝喊话。

管理命令为/jc，有以下用法：
`/jc add <player> <amount> - 为用户增加喇叭;
/jc take <player> <amount> - 为用户减少喇叭;
/jc check <player> - 查询用户余额;`

TODO:
跨服私信
