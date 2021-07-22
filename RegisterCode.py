from tkinter import *

def codeYou():
	root = Tk(className="RecordInsert")
	root.geometry("400x300")
	
	
	form = LabelFrame(root,text="Code")
	form.pack()
	
	Label(form,text="UserName :",width=10,justify=RIGHT).grid(row=0,column=0)
	username = StringVar()
	Entry(form,width=10,bg="#BBBBBB",textvariable=username).grid(row=0,column=1)
	
	Label(form,text="Name :",width=10,justify=RIGHT).grid(row=1,column=0)
	name = StringVar();
	Entry(form,width=10,bg="#BBBBBB",textvariable=name).grid(row=1,column=1)
	
	Label(form,text="Roll No:",width=10,justify=RIGHT).grid(row=2,column=0)
	roll = IntVar()
	roll.set(0)
	Entry(form,width=10,bg="#BBBBBB",textvariable=roll).grid(row=2,column=1)
	
	Label(form,text="Subject :",width=10,justify=RIGHT).grid(row=3,column=0)
	subject = StringVar()
	Entry(form,width=10,bg="#BBBBBB",textvariable=subject).grid(row=3,column=1)
	# ///--------
	
	Label(form,text="gender",width=10,justify=RIGHT).grid(row=4,column=0)
	gender = StringVar();
	Radiobutton(form,text="Male",value="male",variable=gender).grid(row=4,column=1)
	Radiobutton(form,text="Female",value="female",variable=gender).grid(row=4,column=2)
	Radiobutton(form,text="Other",value="Other",variable=gender).grid(row=4,column=3)
	
	Label(form,text="Course",width=10,justify=RIGHT).grid(row=5,column=0)
	course = Frame(form)
	course.grid(row=5,column=1)
	
	sb = Scrollbar(course)
	sb.pack(side=RIGHT,fill=Y)
	list = Listbox(course,height=1,width=10,selectbackground="red",yscrollcommand=sb.set)
	list.insert(0,"HACK")
	list.insert(1,"CLOUD")
	list.insert(2,"SOFTWARE")
	list.insert(3,"HARDWARE")
	list.pack(side=LEFT)
	sb.config(command=list.yview)
	
	Button(form,text="print",command=lambda : codeME()).grid(row=6,column=0);
	root.mainloop()

	print("\n------------------")
	#logic to get course name
	try:
		courseName = list.get(list.curselection()[0])
	except:
		courseName = "None"
	import pymysql
	con = pymysql.connect(host="localhost",user="root",password="",database="infoCode")
	if not con:
		print("Error.....")
		return 1;
	cmd = con.cursor()
	try:
		str = """CREATE TABLE info(Sr_No int(3) NOT NULL AUTO_INCREMENT,
							userName varchar(20),
							name varchar(20),
							rollno int(2),
							subject varchar(20),
							gender varchar(10),
							course varchar(10),
							PRIMARY KEY(Sr_No))"""
		cmd.execute(str);
		con.commit()
	except:
		pass

	################  for valid username
	str = "SELECT `userName` FROM `info`"
	cmd.execute(str)
	r = cmd.fetchall()
	for i in r:
		if i[0]==username.get():
			print("invalid username ...");
			return 10;
	print(username.get())
	print(name.get())
	print(roll.get())
	print(subject.get())
	print(gender.get())
	print(courseName)

	################
	str = """INSERT INTO `info`(`userName`,`name`,`rollno`,`subject`,`gender`,`course`) 
				VALUES(%s,%s,%s,%s,%s,%s)""";
	val = (username.get(),name.get(),roll.get(),subject.get(),gender.get(),courseName)
	cmd.execute(str,val);
	con.commit()


if __name__ == "__main__":
	codeYou()