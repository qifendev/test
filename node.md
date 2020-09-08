# 使用笔记

**docker 加速**

```json
{
  "registry-mirrors": ["https://jnkv1aao.mirror.aliyuncs.com"]
}
```

```shell
systemctl daemon-reload
systemctl restart docker
```

## Wine

### 安装 wine

<https://github.com/wszqkzqk/deepin-wine-ubuntu>

### 乱码解决

gedit /opt/deepinwine/tools/run.sh

找到 WINE_CMD

WINE_CMD="LC_ALL=zh_CN.UTF-8 deepin-wine"

### 窗口太小

```
WINEPREFIX=~/.deepinwine/你的wine容器目录  /usr/bin/deepin-wine  winecfg
```

### 微信不能发图片

sudo apt install libjpeg62:i386

## 机场

sslocal -c /etc/shadowsocks.json -d start

## ssh key

ssh-keygen -t rsa -C "xxx@gmail.com"
cat ~/.ssh/id_rsa.pub

## gradle 依赖慢

maven{ url 'http://maven.aliyun.com/nexus/content/groups/public/'}
maven { url 'https://maven.aliyun.com/repository/google' }
maven { url 'https://maven.aliyun.com/repository/jcenter' }

## 字体安装

sudo add-apt-repository ppa:no1wantdthisname/ppa
sudo apt update
sudo apt install libfreetype6

## 网易云音乐字体太小

sudo vi /usr/share/applications/netease-cloud-music.desktop
Exec=netease-cloud-music --force-device-scale-factor=1.25 %U

## VS Code

设置命令行运行："code-runner.runInTerminal" : true

## Linux

#### 设置定时任务

```bash
使用crontab [-u username] -e(编辑工作表)/-l(列出工作表中的命令)/-r(删除工作任务)
定时任务 分、时、日、月、周 对应 五个 *
*取范围内的所有数字
/每过多少个数字
-从X到Z
,散列数字
案例：
* * * * * command #每分钟执行一次命令
3,15 * * * * command #每小时的第3和15分钟执行
3,15 8-11 * * * command #在上午8点到11点第3和15分钟执行
3,15 8-11 */2 * * command #每隔两天的上午8点到11点第3和15分钟执行
3,15 8-11 * * 1 command #每周一上午8点到11点的第3和第15分钟执行
30 21 * * * command #每晚的21:30执行
10 1 * * 6,0 command #每周六、周日的1:10执行
0,30 18-23 * * * command #每天18:00至23:00之间每隔30分钟执行一次
0 23 * * 6 command #每周六晚上11点执行
* */1 * * * command #每小时执行
* 23-7/1 * * * command #晚上11点到早上7点之间，每隔一小时执行一次
```

#### 开机自启动

```bash
crontab -e
@reboot /home/user/test.sh
```

#### 关闭 ipv6

临时关闭，关机后失效

```sh
sudo sysctl -w net.ipv6.conf.all.disable_ipv6=1
sudo sysctl -w net.ipv6.conf.default.disable_ipv6=1
sudo sysctl -w net.ipv6.conf.lo.disable_ipv6=1
```

永久关闭 在/etc/sysctl.conf 加入：

```sh
net.ipv6.conf.all.disable_ipv6=1
net.ipv6.conf.default.disable_ipv6=1
net.ipv6.conf.lo.disable_ipv6=1
```


