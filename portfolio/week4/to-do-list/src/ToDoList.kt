// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

//oscar hazel 2026-10-28
class ToDoList()
{
	private val items=mutableListOf<ToDoItem>()

	val size get()=items.size
	val notStarted // compute no. of items with NotStarted status
		get()=items.count{it.status==ItemStatus.NotStarted}
	val inProgress // compute no. of items with InProgress status
		get()=items.count{it.status==ItemStatus.InProgress}
	val done // compute no. of items with Done status
		get()=items.count{it.status==ItemStatus.Done}
	val overdue // compute no. of overdue items
		get()=items.count{it.isOverdue()}

	constructor(filename: String): this()
	{
		load(filename)
	}

	fun load(filename: String)
	{
		// Implement code to read To Do list from a file here
		// See data/to-do.csv for an example of the format
		/*Path(filename).reader().use
		{
			for()
		}*/
		items.clear()
		Path(filename).forEachLine {
			val elements=it.split(": ");
			val date=LocalDate.parse(elements[0])
			val status=ItemStatus.valueOf(elements[1])
			items.add(ToDoItem(date,status,elements[2]))
		}
	}

	fun save(filename: String)
	{
		Path(filename).writer().use {
			for(item in items)
			{
				it.write("$item\n")
			}
		}
	}

	fun add(vararg item: ToDoItem)=item.forEach{items.add(it)}

	fun deleteDone(): Boolean
	{
		// Write code here to remove items with status of Done
		// Return true if any were removed, false if none were removed
		val doneItems=items.filter{it.status==ItemStatus.Done}
		items.removeAll(doneItems)
		return doneItems.size>0
	}

	fun getItems(status: ItemStatus?=null): List<ToDoItem>
	{
		// Write code here to return a list of items with the matching
		// status, or a list of all items if status argument is null
		if(status==null) return items
		return items.filter{it.status==status}
	}

	fun getItemsDueOn(date: LocalDate): List<ToDoItem>
	{
		// Write code here to return a list of items
		// that are due on the specified date
		return items.filter{it.dueDate==date}
	}
}
