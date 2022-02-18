
Дмитрий@DESKTOP-81DJDNP MINGW64 ~
$ cd D:\уник\KotlinAsFirst2020
bash: cd: D:уникKotlinAsFirst2020: No such file or directory

Дмитрий@DESKTOP-81DJDNP MINGW64 ~
$ cd D:/уник/KotlinAsFirst2020

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git remote add upstream-my https://github.com/tuchkovdima/KotlinAsFirst

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git fetch upstream-my/master
fatal: 'upstream-my/master' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git remote list
error: Unknown subcommand: list
usage: git remote [-v | --verbose]
   or: git remote add [-t <branch>] [-m <master>] [-f] [--tags | --no-tags] [--mirror=<fetch|push>] <name> <url>
   or: git remote rename <old> <new>
   or: git remote remove <name>
   or: git remote set-head <name> (-a | --auto | -d | --delete | <branch>)
   or: git remote [-v | --verbose] show [-n] <name>
   or: git remote prune [-n | --dry-run] <name>
   or: git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)...]
   or: git remote set-branches [--add] <name> <branch>...
   or: git remote get-url [--push] [--all] <name>
   or: git remote set-url [--push] <name> <newurl> [<oldurl>]
   or: git remote set-url --add <name> <newurl>
   or: git remote set-url --delete <name> <url>

    -v, --verbose         be verbose; must be placed before a subcommand


Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git remote -v
origin  https://github.com/tuchkovdima/KotlinAsFirst2020 (fetch)
origin  https://github.com/tuchkovdima/KotlinAsFirst2020 (push)
upstream-my     https://github.com/tuchkovdima/KotlinAsFirst (fetch)
upstream-my     https://github.com/tuchkovdima/KotlinAsFirst (push)

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git fetch upstream-my
remote: Enumerating objects: 713, done.
remote: Counting objects: 100% (660/660), done.
remote: Compressing objects: 100% (290/290), done.
remote: Total 713 (delta 333), reused 529 (delta 208), pack-reused 53
Receiving objects: 100% (713/713), 233.93 KiB | 3.96 MiB/s, done.
Resolving deltas: 100% (355/355), completed with 47 local objects.
From https://github.com/tuchkovdima/KotlinAsFirst
 * [new branch]      2016.begin    -> upstream-my/2016.begin
 * [new branch]      2016.end      -> upstream-my/2016.end
 * [new branch]      2017.begin    -> upstream-my/2017.begin
 * [new branch]      2017.end      -> upstream-my/2017.end
 * [new branch]      2018.end      -> upstream-my/2018.end
 * [new branch]      2018/master   -> upstream-my/2018/master
 * [new branch]      gradle        -> upstream-my/gradle
 * [new branch]      master        -> upstream-my/master
 * [new branch]      mg-fixes      -> upstream-my/mg-fixes
 * [new branch]      new-scoring   -> upstream-my/new-scoring
 * [new branch]      new-scoring-2 -> upstream-my/new-scoring-2
 * [new branch]      references    -> upstream-my/references

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
  
Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git log upstream-my/master
commit 3553637a6ba383d5a1e52e658bded6b622414460 (upstream-my/master)
commit 3553637a6ba383d5a1e52e658bded6b622414460 (upstream-my/master)
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Dec 20 00:37:48 2021 +0300

    лессон 6 7

commit 714b6f33ece5a3814817be599e7d29bd4732fb77
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Dec 13 00:18:51 2021 +0300

    лессон 7

commit 65d823dfac9180f538cb6cdcc29843b5ccd2c8ee
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Dec 11 23:45:19 2021 +0300

    лессон 7

commit 494aa6176c0e8fe71786b0cbfface257eeff0210
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Dec 11 23:36:13 2021 +0300

    лессон 6

commit 6d5c272993f700d4ec84a6d0481f5212e0f6e2da
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Dec 7 00:59:27 2021 +0300

    лессон 6

commit 54ed398f0aa593f6d4585c2e22070ce33d64cad9
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Dec 7 00:49:46 2021 +0300

    лессон 6

commit 5a5d1d926d2453e7848344fceabe32f2e5a7bc49
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Dec 7 00:22:43 2021 +0300

    лессон 6

commit 1ec20d7c382b5a5529c08fdd787b728a7a62f6a2
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Dec 6 01:26:02 2021 +0300

    лессон 7

commit b10e662b1ceb65e7f8e389cd31088344418aab72
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Dec 5 22:29:47 2021 +0300

    лессон 6

commit e1c3f6414850fd606d3f448992b851580815ffbe
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Nov 30 22:32:05 2021 +0300

    лессон 6

commit 69a46a1ab3fd802516f9e04fd4c983f4b8d0d30e
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Nov 14 23:43:50 2021 +0300

    лессон 7

commit 0cfd80916f65c1cfa24b656e3ef67b86a23e4bfb
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Nov 14 23:34:10 2021 +0300

    лессон 7

commit 75b8b27138511ae0a47cd79015ba2a0e3b83211a
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Nov 14 23:32:53 2021 +0300

    лессон 7

commit d1fcaf3d4379182e64b075b846438fa8cb87e843
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Nov 13 01:00:31 2021 +0300

    лессон 6 исправлено

commit d8189170e0e6e75dd67dc518979b178cd8f499f2
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Nov 9 20:09:42 2021 +0300

    лессон 6

commit 87afaf88612aaef7d56c045e5e7b11d6a7e652cc
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Nov 9 19:54:11 2021 +0300

    лессон 6

commit d3aaead68c9a1b219bc54b63542217069e76ea1c
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 26 01:00:40 2021 +0300

    лессон 5

commit 798a322f67ec8920209d55ad9d8f6254151f0a96
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Oct 25 14:17:16 2021 +0300

    лессон 5

commit cd3c6ad1fc65ef196c5f2d0cc204c5928454a079
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Fri Oct 22 23:25:03 2021 +0300

    лессон 5

commit 00c13cdff634b74f27f1713a205b7c91f7a1e502
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Thu Oct 21 23:06:23 2021 +0300

    лессон 3 решен

commit 8533354d564f09c63c36b6acc8fc460b820413f2
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 19 21:05:53 2021 +0300

    лессон 3 коменты

commit bfac897e2a997ee53f39f0c3557f16ec5f126c91
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Oct 18 19:54:02 2021 +0300

    лессон 4

commit 982f02ff561c376e90e063af700e359e5b992758
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Oct 18 17:27:56 2021 +0300

    лессон 4

commit 0500689bf964a94c29d17fe325da6fe2713055cb
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Oct 18 16:56:21 2021 +0300

    Тест 3 и лессон 4

commit 3e3c63a9da60ec34359e201dc5256e453a915ba9
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Oct 10 00:53:19 2021 +0300

    лессон 4

commit 7a481c70327a59925fed3dba06419e40f900157a
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 5 22:10:37 2021 +0300

    исправлены ошибки/

commit 5d61542b438d2756d66ad8a0c8a0833752861ee0
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 5 21:39:50 2021 +0300

    исправлены ошибки ладьи

commit 5d9cd470c0faa84924481c3c24d84a9478d40c09
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 5 21:27:59 2021 +0300

    исправлены ошибки

commit 556b5611143e8b654573379d134ed7557712ccf5
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 5 12:59:32 2021 +0300

    фигуры

commit 94394f6e93d74f521dd2fd01673262320f989889
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Fri Sep 24 23:27:45 2021 +0300

    Исправлены ошибки lesson 3

commit 7da924ab1f9680f6f10ea78adfea6488cce384a2
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Fri Sep 24 21:01:48 2021 +0300

    Исправлены ошибки

commit 1bf135f439141783e28c9a195db1abebd8c47e15
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 21 01:11:14 2021 +0300

    squareSequenceDigit исп

commit 4bacd10a0b68c9c49c966712fa02d397f8e05a37
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 21 00:52:08 2021 +0300

    исправлены ошибки 1

commit e8f26daaaa5ca94b8da1e582e002e912b15028b9
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Sep 20 01:06:52 2021 +0300

    lesson 3

commit d1f70eefab4fb4f3029cc8c23d38c85e7c263b72
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Wed Sep 15 00:12:44 2021 +0300

    Исправлена задача про путника

commit b7587ba627fc331f675190aa8055fa11b89b501b
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 20:47:12 2021 +0300

    попытка вычисления угла номер 14

commit 10653de664a0d3a32800f9559092ef718e9a10c5
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 20:37:09 2021 +0300

    вычисление углов 1.1

commit f1d80a3f49036f6dfd2cac3ed64bc5d1f4e9a9a6
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 20:31:12 2021 +0300

    вычисление углов

commit ed7ead68659a7cc309e2e16f76869980d2bad9ee
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 20:14:22 2021 +0300

    Исправлена ошибка с месецами

commit a56275bf1d8ad1e7d41181a879d77b7888377e09
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 19:30:00 2021 +0300

    исправлены ошибки 1

commit 12bdf88794e9e3f9acac5a24a6f987204f1d8354
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 19:08:26 2021 +0300

    исправлены ошибки

commit 83f2aca3e55db436be3692b1c103175597383c2e
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Sep 12 19:15:17 2021 +0300

    внесены изменения

commit 129145b39500bf8402003c7828a32b74f23643c9
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Sep 11 17:10:13 2021 +0300

    лессон 2 таск 2

commit 00586177239777c3159708e64bbdab253ada723a
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Sep 11 16:39:33 2021 +0300

    проставлены enter

commit bc704d03fabbe160478e23e65083b90ac5ee1c3b
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Sep 11 16:32:29 2021 +0300

    лессон 2 таск 1

commit 3ad870643b61229f742ea26ffc599368b34481e7
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 22:55:28 2021 +0300

    точность 85

commit 31c0cc1d061e18fc2a6c7cb1cd07f950ea5cb7c9
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 22:33:22 2021 +0300

    радиан исправить (точность)

commit 67cef58606b1d8c962b38fc7ed92f5407a8d0fb3
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 22:07:52 2021 +0300

    Добавлены 93,101,110,119,130

commit d6127c18e5f4fe9bd1fe595259a8fbdd39418cb8
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 19:41:09 2021 +0300

    85 и 93 строчки добавлен конверт и длина отрезка

commit 51dcfe43b48aff0e1f90f115eb9c75df71b0bb08
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 19:27:39 2021 +0300

    85 добавление функции угла в минут

commit e4a52ed2a8e7d28d6ccf8f56361e8cb9d749fd3a
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 19:26:27 2021 +0300

    85 добавление функции угла в мин

commit 92b45d69633272f165e99877dcc87e6833090a50
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 18:58:20 2021 +0300

    строчка 77 вершки

commit e6c325851592e7ea37d5b2c803868b7d4f2a452a
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 13:23:58 2021 +0300

    Реизция секон (пример) 68 стр

commit 35925dfc5c7bf1e566102d67afb546a8e1a37627
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:34:38 2021 +0300

    README: Update chapter 10 info

commit 06ead379b446c1c1abee336069793124d2e64ce8
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:33:31 2021 +0300

    README: Update configuration manual link

commit 58ea7b66b84830320e8629f32de5f4e531eee6c2
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:26:54 2021 +0300

    Chapter 0: fix typo

commit c4c55e77681501cfe602d36cbbc5db13ee4adefd
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:25:33 2021 +0300

    Chapter 0: some other FAQs

commit 6e38f502fb1c8356ece412825cbd33cebf9c9b50
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:21:56 2021 +0300

    Chapter 0: update links and minor details

commit f0ffab62d9683abdfed2291e3b014ebf8c601285
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 13:05:47 2021 +0300
commit e6c325851592e7ea37d5b2c803868b7d4f2a452a
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 13:23:58 2021 +0300

    Реизция секон (пример) 68 стр

commit 35925dfc5c7bf1e566102d67afb546a8e1a37627
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:34:38 2021 +0300

    README: Update chapter 10 info

commit 06ead379b446c1c1abee336069793124d2e64ce8
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:33:31 2021 +0300

    README: Update configuration manual link

commit 58ea7b66b84830320e8629f32de5f4e531eee6c2
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:26:54 2021 +0300

    Chapter 0: fix typo

commit c4c55e77681501cfe602d36cbbc5db13ee4adefd
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:25:33 2021 +0300

    Chapter 0: some other FAQs

commit 6e38f502fb1c8356ece412825cbd33cebf9c9b50
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 14:21:56 2021 +0300

    Chapter 0: update links and minor details

commit f0ffab62d9683abdfed2291e3b014ebf8c601285
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Fri Sep 3 13:05:47 2021 +0300

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git rebase --onto master 35925dfc5c7bf1e566102d67afb546a8e1a37627 upstream-my/master
Committer identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Дмитрий@DESKTOP-81DJDNP.(none)')

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (detached HEAD|REBASE 1/53)
$ git config --global user.email "tuchkov.da@edu.spbstu.ru"

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (detached HEAD|REBASE 1/53)
$ git config --glibal user.email "Tuchkov Dima"
error: unknown option `glibal'
usage: git config [<options>]

Config file location
    --global              use global config file
    --system              use system config file
    --local               use repository config file
    --worktree            use per-worktree config file
    -f, --file <file>     use given config file
    --blob <blob-id>      read config from given blob object

Action
    --get                 get value: name [value-pattern]
    --get-all             get all values: key [value-pattern]
    --get-regexp          get values for regexp: name-regex [value-pattern]
    --get-urlmatch        get value specific for the URL: section[.var] URL
    --replace-all         replace all matching variables: name value [value-pattern]
    --add                 add a new variable: name value
    --unset               remove a variable: name [value-pattern]
    --unset-all           remove all matches: name [value-pattern]
    --rename-section      rename section: old-name new-name
    --remove-section      remove a section: name
    -l, --list            list all
    --fixed-value         use string equality when comparing values to 'value-pattern'
    -e, --edit            open an editor
    --get-color           find the color configured: slot [default]
    --get-colorbool       find the color setting: slot [stdout-is-tty]

Type
    -t, --type <>         value is given this type
    --bool                value is "true" or "false"
    --int                 value is decimal number
    --bool-or-int         value is --bool or --int
    --bool-or-str         value is --bool or string
    --path                value is a path (file or directory name)
    --expiry-date         value is an expiry date

Other
    -z, --null            terminate values with NUL byte
    --name-only           show variable names only
    --includes            respect include directives on lookup
    --show-origin         show origin of config (file, standard input, blob, command line)
    --show-scope          show scope of config (worktree, local, global, system, command)
    --default <value>     with --get, use default value when missing entry


Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (detached HEAD|REBASE 1/53)
$ git config --global user.email "TuchkovDima"

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (detached HEAD|REBASE 1/53)
$ git rebase --onto master 35925dfc5c7bf1e566102d67afb546a8e1a37627 upstream-my/master
fatal: It seems that there is already a rebase-merge directory, and
I wonder if you are in the middle of another rebase.  If that is the
case, please try
        git rebase (--continue | --abort | --skip)
If that is not the case, please
        rm -fr ".git/rebase-merge"
and run me again.  I am stopping in case you still have something
valuable there.


Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (detached HEAD|REBASE 1/53)
$ git rebase --abort

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 ((3553637...))
$ git rebase --onto master 35925dfc5c7bf1e566102d67afb546a8e1a37627 upstream-my/master
Successfully rebased and updated detached HEAD.

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 ((a26b76d...))
$ git che
checkout      cherry        cherry-pick

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 ((a26b76d...))
$ git checkout

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 ((a26b76d...))
$ git checkout -b backport
Switched to a new branch 'backport'

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git loak
git: 'loak' is not a git command. See 'git --help'.

The most similar commands are
        clean
        clone
        log

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git log
commit a26b76d05639cddd4bfc51c2df63938700da9f6c (HEAD -> backport)
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Dec 20 00:37:48 2021 +0300

    лессон 6 7

commit f9a897af2c45464f36fc4e96d3e501dfe02cf0c7
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Dec 13 00:18:51 2021 +0300

    лессон 7

commit f8a858bbae494578abcb112ddd4395a2b5e83beb
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Dec 11 23:45:19 2021 +0300

    лессон 7

commit d872d7a78350779ad39995a65cd7de457f5d6396
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Dec 11 23:36:13 2021 +0300

    лессон 6

commit 51d30ab0a9b3269d843bc740ad0723c5814229de
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Dec 7 00:59:27 2021 +0300

    лессон 6

commit 43bad9b049a4c3502551f3f36a379f21e773254d
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Dec 7 00:49:46 2021 +0300

    лессон 6

commit c1c5a0ed5d655e6111388236efaf7eec0290fdeb
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Dec 7 00:22:43 2021 +0300

    лессон 6

commit 8574a97e398f05be8b4ae404a5a50dbd08505240
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Dec 6 01:26:02 2021 +0300

    лессон 7

commit 97c05a5d7a42340c4260b83ecd3419255eed671a
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Dec 5 22:29:47 2021 +0300

    лессон 6

commit 981adfdd60134031a0d29676a2a38e0835dba166
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Nov 30 22:32:05 2021 +0300

    лессон 6

commit 30ceed06b603c984002ce23faa9486c943fa7e1e
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Nov 14 23:43:50 2021 +0300

    лессон 7

commit 8b2c8529b5c1ea548ae3497bfc008d10829e3379
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Nov 14 23:34:10 2021 +0300

    лессон 7

commit 68b615417e33b3671091f4ec6f1a8a2e0ff5a4b7
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Nov 14 23:32:53 2021 +0300

    лессон 7

commit 851cb471bc998e0a5ef3950dec44e73fbb135e47
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Nov 13 01:00:31 2021 +0300

    лессон 6 исправлено

commit f70f59a7bb782f097a14b4b29297c78906962d0f
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Nov 9 20:09:42 2021 +0300

    лессон 6

commit d35775202795c423b44dd354202275ff8c8c0cbb
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Nov 9 19:54:11 2021 +0300

    лессон 6

commit 463cacdaaaf6a7c6ff171b4c4634ee92de1b2cea
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 26 01:00:40 2021 +0300

    лессон 5

commit 7fc0792d89e5bc794259cc016ab525246d789684
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Oct 25 14:17:16 2021 +0300

    лессон 5

commit f9a643b66a6427bde322c84ed12850a8cb8e0c45
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Fri Oct 22 23:25:03 2021 +0300

    лессон 5

commit 8482ce02471c5b49cdaa2525e243419997071b90
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Thu Oct 21 23:06:23 2021 +0300

    лессон 3 решен

commit ecb7bdbdf98de9320897066bb8dbc2604d1886b5
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 19 21:05:53 2021 +0300

    лессон 3 коменты

commit ba61719a318b11ca0491278a8b009cfb7dd041ec
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Oct 18 19:54:02 2021 +0300

    лессон 4

commit feb701c64dc1ba2fa73f179f174e6adbe32d7e93
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Oct 18 17:27:56 2021 +0300

    лессон 4

commit c6a471dd36e78bad5d756dfefac52c7c507bee69
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Oct 18 16:56:21 2021 +0300

    Тест 3 и лессон 4

commit 61a125184ddc006d7dbcff0c0bf377e7f95112eb
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Oct 10 00:53:19 2021 +0300

    лессон 4

commit 4c8cba7bea5f37b30c2fe4fdd7f8561e6556b865
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 5 22:10:37 2021 +0300

    исправлены ошибки/

commit 24aff9cc9bbe7623f92fa68118b9b09387316adb
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 5 21:39:50 2021 +0300

    исправлены ошибки ладьи

commit c3e938d911a91973fa24e93d91e1582ced2a317a
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 5 21:27:59 2021 +0300

    исправлены ошибки

commit fbe0fc38b409f75d38aebc7a9002cf97f36bf57f
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Oct 5 12:59:32 2021 +0300

    фигуры

commit fd5f2bc619c03e34d304cae07d51873794071973
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Fri Sep 24 23:27:45 2021 +0300

    Исправлены ошибки lesson 3

commit 37b091d2e607f042253ecc4415251215efb21327
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Fri Sep 24 21:01:48 2021 +0300

    Исправлены ошибки

commit 7f3f151fa8f913c151dec0fcf8962efe34a2f24f
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 21 01:11:14 2021 +0300

    squareSequenceDigit исп

commit bcb3d41bcd3efec21d81fcfa3c599f862929b681
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 21 00:52:08 2021 +0300

    исправлены ошибки 1

commit b4a151a62352777d0f321b8deeabfe2c15d24caa
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Mon Sep 20 01:06:52 2021 +0300

    lesson 3

commit 129231e1f2e72484df5341be133bb69abd232470
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Wed Sep 15 00:12:44 2021 +0300

    Исправлена задача про путника

commit 70c2cfa08bd42bb79660a0bee2ad459a94583435
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 20:47:12 2021 +0300

    попытка вычисления угла номер 14

commit ab4d14c8010526b02f8a4a8ac5865967de4ac4a3
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 20:37:09 2021 +0300

    вычисление углов 1.1

commit d6246d900e525aef63f3b0e0ae30eddcdd593034
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 20:31:12 2021 +0300

    вычисление углов

commit a0da9e1eed4d52f7e0d73a1867707ae20a7f960b
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 20:14:22 2021 +0300

    Исправлена ошибка с месецами

commit cf82b5da656c6f3b99c3c38edcb4d68a3a182b69
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 19:30:00 2021 +0300

    исправлены ошибки 1

commit 4ce92384342f3b7114289a0bf7519b8884efcca6
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 14 19:08:26 2021 +0300

    исправлены ошибки

commit 1a97cf8eda5622af3f80c527c681cfff753743d0
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sun Sep 12 19:15:17 2021 +0300

    внесены изменения

commit ed3ec22e7a99acce75f81b9e63a06bb35773e44e
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Sep 11 17:10:13 2021 +0300

    лессон 2 таск 2

commit 408107c6c1315c1e4b23129e60ae0a1741b4d3ff
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Sep 11 16:39:33 2021 +0300

    проставлены enter

commit 81de1aa6598a248d189227ff9a0d7ea0a703c9f7
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Sat Sep 11 16:32:29 2021 +0300

    лессон 2 таск 1

commit f4e4b96986d0f314b1f2dcd050ae905d599fdb4b
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 22:55:28 2021 +0300

    точность 85

commit a2e2013cee270685c97f40d868999d324ac4f790
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 22:33:22 2021 +0300

    радиан исправить (точность)

commit ee49be67358c59287159f7c4b8b2a60d6a2d1855
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 22:07:52 2021 +0300

    Добавлены 93,101,110,119,130

commit eacd14db51abbff49730196c3c16b139b61ed8af
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 19:41:09 2021 +0300

    85 и 93 строчки добавлен конверт и длина отрезка

commit c02f906238b23f9a0ecf932e9af89dfee4863b2e
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 19:27:39 2021 +0300

    85 добавление функции угла в минут

commit 20cf9821d988596198d4000d2d9f6675c3ff60a5
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 19:26:27 2021 +0300

    85 добавление функции угла в мин

commit 98650b20b0c0be775fd51fd5fbd2ff4b83751288
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 18:58:20 2021 +0300

    строчка 77 вершки

commit 65778c0f5a98e5e6e02eda0863b10f12fa814902
Author: ДмитрийТ <tuchov.da@edu.spbstu.ru>
Date:   Tue Sep 7 13:23:58 2021 +0300

    Реизция секон (пример) 68 стр

commit d535f3592006b8f2593c9f881d72c05164aadc13 (origin/master, origin/HEAD, master)
Author: Mikhail Glukhikh <glukhikh@mail.ru>
Date:   Fri Sep 4 18:49:48 2020 +0300

    Add extra check to get TODO in test for 10.1 task

    (cherry picked from commit 280a1006c2d8dfae877496ebda7ce12bfe1503a9)

commit b59194c70b8733ce841d1df642758dd827315f6e
Author: ice-phoenix <Marat.Akhin@gmail.com>
Date:   Fri Sep 4 17:09:52 2020 +0300

    Drop Coursera project link from README.md

commit ced754403cfa20bebdba1be22aade78e615d334e
Author: Mikhail Glukhikh <glukhikh@mail.ru>
Date:   Fri Sep 4 00:03:27 2020 +0300

    Fix for deleteMarked

commit 279179c0c3bfd29b805332158be4e8870a36dcc5
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Thu Sep 3 20:44:59 2020 +0300

    Fix: 2019 -> 2020

commit 0e1b425091f651d613339d26b4dc6fc6babccde1
Author: Mikhail Glukhikh <mikhail.glukhikh@jetbrains.com>
Date:   Thu Sep 3 20:43:01 2020 +0300

    Update references to INSYS

commit e2a74c62050462952ba7ea7abb69ddb7ba7a62f0

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git remote add upstream-theirs https://github.com/rinpatch/KotlinAsFirst2021

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git fetch

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git fetch upstream-theirs
remote: Enumerating objects: 497, done.
remote: Counting objects: 100% (164/164), done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 497 (delta 159), reused 162 (delta 159), pack-reused 333
Receiving objects: 100% (497/497), 59.58 KiB | 924.00 KiB/s, done.
Resolving deltas: 100% (239/239), completed with 21 local objects.
From https://github.com/rinpatch/KotlinAsFirst2021
 * [new branch]      master     -> upstream-theirs/master

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git checkout

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git checkout ,aster
error: pathspec ',aster' did not match any file(s) known to git

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git merge backport
Updating d535f35..a26b76d
Fast-forward
 src/lesson1/task1/Simple.kt  |  27 +-
 src/lesson2/task1/IfElse.kt  |  81 +++++-
 src/lesson2/task2/Logical.kt |  34 ++-
 src/lesson3/task1/Loop.kt    | 195 ++++++++++++-
 src/lesson4/task1/List.kt    |  64 ++++-
 src/lesson5/task1/Map.kt     |  30 +-
 src/lesson6/task1/Parse.kt   |  80 +++++-
 src/lesson7/task1/Files.kt   | 664 +++++++++++++++++++++++--------------------
 test/lesson1/task1/Tests.kt  |   1 +
 test/lesson3/task1/Tests.kt  |   3 +-
 test/lesson4/task1/Tests.kt  |   9 +-
 test/lesson6/task1/Tests.kt  |  28 +-
 12 files changed, 841 insertions(+), 375 deletions(-)

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git merge -s ours upstream-theirs/master
Merge made by the 'ours' strategy.

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git remote -v > remotes

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git add remotes
warning: LF will be replaced by CRLF in remotes.
The file will have its original line endings in your working directory

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git commit -m "Добавил remotes"
[master 8e81d65] Добавил remotes
 1 file changed, 6 insertions(+)
 create mode 100644 remotes

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
Enumerating objects: 1101, done.
Counting objects: 100% (1101/1101), done.
Delta compression using up to 4 threads
Compressing objects: 100% (361/361), done.
Writing objects: 100% (1019/1019), 138.47 KiB | 951.00 KiB/s, done.
Total 1019 (delta 505), reused 771 (delta 357), pack-reused 0
remote: Resolving deltas: 100% (505/505), completed with 37 local objects.
To https://github.com/tuchkovdima/KotlinAsFirst2020
   d535f35..8e81d65  master -> master

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git che
checkout      cherry        cherry-pick

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git che
checkout      cherry        cherry-pick

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git che
checkout      cherry        cherry-pick

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git che
checkout      cherry        cherry-pick

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (master)
$ git checkout backport
Switched to branch 'backport'

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$ git push -u origin HEAD
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0
remote:
remote: Create a pull request for 'backport' on GitHub by visiting:
remote:      https://github.com/tuchkovdima/KotlinAsFirst2020/pull/new/backport
remote:
To https://github.com/tuchkovdima/KotlinAsFirst2020
 * [new branch]      HEAD -> backport
branch 'backport' set up to track 'origin/backport'.

Дмитрий@DESKTOP-81DJDNP MINGW64 /d/уник/KotlinAsFirst2020 (backport)
$
