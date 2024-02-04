<h2 align="center" style="font-size:200%;line-height:2;">CSE 3310 Semester Project</h2>

# Project Description

The semester project is the creation of a multi-user, web-based chat program, called WebChat. It will be
coded in the Java programming language and will provide the user(s) with a browser-based interface.
Given this is a summer course and is over 11 weeks (about 2 and a half months) instead of the usual 14
weeks (about 3 months).

# Features
- Typing status:
  - Displays notification of when a user starts typing in the message input bar.
  - Displays for 5 seconds, or until a new status notification replaces it.
- Auto-login:
  - Can refresh the page, or open the site in a new tab, and will remain logged in with the last used credentials.
- Notifications:
  - When a message is received while the user is in another tab, will send a message notification.
  - Notifications close automatically when the tab is opened.
- Ignore list:
  - Can add and remove users to your ignore list.
  - Messages from ignored users are not displayed.
  - Typing status of ignored users not displayed.
  - Notifications from ignored users are blocked.
- User activity monitoring
  - Tracks the time since each user was last active

# Usage
- Supported commands:
  - /ignore
    - /ignore add <username> <username1> <username...>
      - To add one or more users to your ignore list
    - /ignore remove <username> <username1> <username...>
      - To remove one or more users to your ignore list
    - /ignore list
      - To list the users on your ignore list
  - /activity
    - To list the time since last activity of all users
